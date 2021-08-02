package io.github.luanelioliveira.booksearch.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "GoogleBookSearch", url = "https://www.googleapis.com/", path = "books/v1")
public interface GoogleBookSearchClient {

  @GetMapping("volumes")
  String searchFor(
      @RequestParam("langRestrict") String langRestrict,
      @RequestParam("maxResults") int maxResults,
      @RequestParam("printType") String printType,
      @RequestParam("q") String query);
}
