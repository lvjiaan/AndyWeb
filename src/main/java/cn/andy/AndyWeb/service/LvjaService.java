package cn.andy.AndyWeb.service;


import cn.andy.AndyWeb.dao.Ms187Dao;
import cn.andy.AndyWeb.entity.Emerging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

@Service
public class LvjaService {

    private final static Logger logger = LoggerFactory.getLogger(LvjaService.class);
    private final Ms187Dao ms187Dao;

    public LvjaService(Ms187Dao ms187Dao) {
        this.ms187Dao = ms187Dao;
    }

    public void TmtIpc() {
        List<Emerging> emergingList = ms187Dao.getEmergingList();
        ExecutorService service = newFixedThreadPool(16);
        emergingList.forEach(item -> service.execute(() -> {
            cleanOneEmerging(item);
        }));
        service.shutdown();
    }

    private void cleanOneEmerging(Emerging item) {
        List<String> outIpcList = new ArrayList<>();
        List<String> inIpcList = new ArrayList<>();
        if (item.getClassifyOut() != null) {
            String[] outs = item.getClassifyOut().split("、");
            for (int i = 0; i < outs.length; i++) {
                String outstr = outs[i];
                if (!outstr.contains("*"))
                    outIpcList.add(outstr);
                else {
                    outIpcList.addAll(getAllIpcFromRoot(outstr));
                }
            }
        }

        if (item.getClassifyIn() != null) {
            String[] ins = item.getClassifyIn().split("、");
            for (int i = 0; i < ins.length; i++) {
                String instr = ins[i];
                if (!instr.contains("*"))
                    inIpcList.add(instr);
                else {
                    if (getAllIpcFromRoot(instr)!=null)
                    inIpcList.addAll(getAllIpcFromRoot(instr));
                }
            }
        }
        //bigCode,bigName,smallCode,smallName,classifyIn,classifyOut,keyWords
        if (outIpcList!=null)
        inIpcList.removeAll(outIpcList);
        for (String ipc:inIpcList){
            ms187Dao.insertAIpc(item.getBigCode(),item.getBigName(),item.getSmallCode(),item.getSmallName(),
                    item.getKeyWords(),ipc);
        }
    }

    private List<String> getAllIpcFromRoot(String ipc) {
        List<String> ipcList = new ArrayList<>();
        if (ipc.endsWith("*"))
            //如果带有*,返回不带*的或者加上/00
            ipc = ms187Dao.getRootIpc(ipc.substring(0, ipc.length() - 1));
        //修正后的根级ipc加入列表
        ipcList.add(ipc);
        List<String> sonIpcList = ms187Dao.getSonIpcList(ipc);
        if (sonIpcList != null && sonIpcList.size() >= 1)
            for (String sonIpc : sonIpcList) {
                ipcList.addAll(getAllIpcFromRoot(sonIpc));
            }
        return ipcList;
    }

}
