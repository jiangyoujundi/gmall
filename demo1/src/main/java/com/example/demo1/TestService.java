package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类说明:
 * <pre>
 * 修改记录：
 * 修改日期     修改人          修改原因
 * 2020-03-05  linzhirong     新建
 * </pre>
 */
@Controller
public class TestService {

    @RequestMapping("index")
    @ResponseBody
    public String testHello() {
        return "hello , idea springbott";
    }

}
