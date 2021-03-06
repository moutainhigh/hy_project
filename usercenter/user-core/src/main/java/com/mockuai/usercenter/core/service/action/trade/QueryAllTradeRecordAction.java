package com.mockuai.usercenter.core.service.action.trade;

import com.mockuai.usercenter.common.action.ActionEnum;
import com.mockuai.usercenter.common.api.UserResponse;
import com.mockuai.usercenter.common.dto.TradeRecordDTO;
import com.mockuai.usercenter.core.exception.UserException;
import com.mockuai.usercenter.core.manager.TradeRecordManager;
import com.mockuai.usercenter.core.service.RequestContext;
import com.mockuai.usercenter.core.service.action.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by duke on 15/9/24.
 */
@Service
public class QueryAllTradeRecordAction implements Action {
    private static final Logger log = LoggerFactory.getLogger(QueryAllTradeRecordAction.class);

    @Resource
    private TradeRecordManager tradeRecordManager;

    @Override
    public UserResponse execute(RequestContext context) throws UserException {
        log.info("Enter Action [{}]", getName());
        List<TradeRecordDTO> tradeRecordDOList = tradeRecordManager.queryAll();
        log.info("Exit Action [{}]", getName());
        return new UserResponse(tradeRecordDOList);
    }

    @Override
    public String getName() {
        return ActionEnum.QUERY_ALL_TRADE_RECORD.getActionName();
    }
}
