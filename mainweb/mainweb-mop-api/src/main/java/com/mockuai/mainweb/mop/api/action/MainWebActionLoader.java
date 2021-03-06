package com.mockuai.mainweb.mop.api.action;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.mockuai.mainweb.common.api.MainWebService;
import com.mockuai.mop.common.service.action.Action;
import com.mockuai.mop.common.service.action.ActionLoader;
import com.mockuai.mop.common.service.action.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * Created by 冠生 on 15/10/28.
 */
public class MainWebActionLoader implements ActionLoader {
    private MainWebService imageService;

    public void init(Context context) {
        RegistryConfig registryConfig = (RegistryConfig) context.getAttribute("registry_config");

        ApplicationConfig application = new ApplicationConfig();
        application.setName("image-mop-api");

        ReferenceConfig reference = new ReferenceConfig();
        reference.setApplication(application);
        reference.setRegistry(registryConfig);
        reference.setRetries(0);
        reference.setInterface(MainWebService.class);
        reference.setCheck(Boolean.valueOf(false));

        this.imageService = ((MainWebService) reference.get());
    }

    public List<Action> load() {
        List actionList = new ArrayList();
        ServiceLoader<BaseAction> serviceLoader = ServiceLoader.load(BaseAction.class);
        for (BaseAction action : serviceLoader) {
            if (action != null) {
                action.setMainWebService(imageService);
                actionList.add(action);
            }
        }
        return actionList;
    }
}
