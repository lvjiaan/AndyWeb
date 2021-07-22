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
        List<String> outIpcList = null;
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


    }

    public List<String> getAllIpcFromRoot(String ipc) {
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
