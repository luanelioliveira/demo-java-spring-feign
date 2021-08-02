package io.github.luanelioliveira.booksearch.controller;

import io.github.luanelioliveira.booksearch.service.BookSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BookController {

  private final BookSearchService bookSearchService;

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public String searchFor(@RequestParam("q") String text) {
    return bookSearchService.searchForBooks(text);
  }
}
