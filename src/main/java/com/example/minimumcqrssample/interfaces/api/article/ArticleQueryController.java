package com.example.minimumcqrssample.interfaces.api.article;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import java.util.function;


@RestController
@RequestMapping("/articles")
@AllArgsConstructor
public class ArticleQueryController {

  private ArticleQueryService service;

  @GetMapping
  public ResponseEntity<ArticleListQueryResponse> list() {
    //  Function<Integer, String> asterisker = (i) -> { return "*"+ i; };
    //  String result = asterisker.apply(10);
    //  System.out.println(result);
    return ResponseEntity.ok(service.list());
  }

}
