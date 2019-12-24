package com.briup.library.web.controller;

import com.briup.library.util.Message;
import com.briup.library.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "图书管理系统")
public class zpController {
    @PostMapping("/add")
    @ApiOperation(value="添加图书信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name",value="书名",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="bno",value="书号",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name="name",value="作者名",paramType = "query",dataType = "String")

    })
    public Message add(String name,int bno,String authorname){
        return MessageUtil.success("添加图书信息成功");
    }
    @GetMapping ("/delete")
    @ApiOperation(value="删除图书信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name",value="书名",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="bno",value="书号",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name="name",value="作者名",paramType = "query",dataType = "String")

    })
    public Message delete(String name,int bno,String authorname){
        return MessageUtil.success("删除图书信息成功");
    }
    @PostMapping ("/update")
    @ApiOperation(value="修改图书信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name",value="书名",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="bno",value="书号",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name="name",value="作者名",paramType = "query",dataType = "String")

    })
    public Message update(String name,int bno,String authorname){
        return MessageUtil.success("修改图书信息成功");
    }
    @GetMapping("/search")
    @ApiOperation(value="查询图书信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name",value="书名",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="bno",value="书号",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name="name",value="作者名",paramType = "query",dataType = "String")

    })
    public Message search(String name,int bno,String authorname){
        return MessageUtil.success("查询图书信息成功");
    }
}
