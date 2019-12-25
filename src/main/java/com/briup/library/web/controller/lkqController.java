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
@Api(description = "图书馆管理系统")
public class lkqController {
    @PostMapping("/add")
    @ApiOperation(value="添加书籍")
    @ApiImplicitParams({@ApiImplicitParam(name = "BookID",value = "书号",paramType = "query",dataType = "int",required = true),
                        @ApiImplicitParam(name = "BookName",value = "书名",paramType = "query",dataType = "String"),
                        @ApiImplicitParam(name = "BookAuthor",value = "书的作者",paramType = "query",dataType = "String")})
    public Message add(int BookID,String BookName,String BookAuthor){
        return MessageUtil.success("添加成功");
    }
    @PostMapping("/change")
    @ApiOperation(value = "修改书籍")
    @ApiImplicitParam(name = "BookID",value = "书号修改",paramType = "query",dataType = "int",required = true)
    public Message change(int BookID){
        return MessageUtil.success("修改成功");
    }
    @GetMapping("/delete")
    @ApiOperation(value = "删除书籍")
    @ApiImplicitParams({@ApiImplicitParam(name = "BookID",value = "书号删除",paramType = "query",dataType = "int",required = true),
                        @ApiImplicitParam(name="BookName",value = "书名删除",paramType = "query",dataType = "String"),
                        @ApiImplicitParam(name = "BookAuthor",value = "书的作者删除",paramType = "query",dataType = "String")
    })
    public Message delete(int BookID,String BookName,String BookAuthor){
        return MessageUtil.success("删除成功");
    }
    @GetMapping("/find")
    @ApiOperation(value = "查找书籍")
    @ApiImplicitParam(name = "BookID",value = "书号查询",paramType = "query",dataType = "int",required = true)
    public Message find(int BookID){
        return MessageUtil.success("查找成功");
    }
}
