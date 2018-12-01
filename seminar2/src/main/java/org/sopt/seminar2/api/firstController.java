package org.sopt.seminar2.api;

import org.springframework.web.bind.annotation.*;

@RestController //@Controller + @ResponseBody
public class firstController {
//    @GetMapping("")
//    public String hello() {
//        return "hello world!";
//    }

//    @RequestMapping(method = RequestMethod.GET, value = "")
//    public String hello2() {
//        return "Nice to Meet You!";
//    }

//    @GetMapping("1")
//    public String hello2() {
//        return "hello world!";
//    }
//
//    @GetMapping("/get1")
//    public String get1() {
//        return "1";
//    }
//
//    @GetMapping("name/{name}")
//    public String getName(@PathVariable final  String name) {   //required = true로 하면 name을 꼭 집어 넣어야 한다.
//        return name;
//    }


    //Request Param은 페이지네이션, 홈으로, 검색 시 사용한다.
    @GetMapping("/part")
    public String getPart(@RequestParam(value = "part", defaultValue = "") final String part) {
        return part;
    }

    @GetMapping("/info")
    public String getPart2(
            @RequestParam(value = "name") final String name,
            @RequestParam(value = "type", defaultValue = "yb") final String type) {
        return name + "이고" + type + "입니다.";
    }

    @GetMapping("/num")
    public int number(@RequestParam(value = "num") final int[] num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }

}
