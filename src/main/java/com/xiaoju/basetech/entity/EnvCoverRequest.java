package com.xiaoju.basetech.entity;

import lombok.Data;

/**
 * @description:
 * @author: charlynegaoweiwei
 * @time: 2020/4/26 7:52 PM
 */
@Data
public class EnvCoverRequest extends CoverBaseRequest{

    private String address;
    private int port;

    /**
     * 环境变量
     */
    private String environment;

    /**
     * 额外的参数
     */
    private String extra;

}