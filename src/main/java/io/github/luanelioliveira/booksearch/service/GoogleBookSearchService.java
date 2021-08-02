package io.github.luanelioliveira.booksearch.service;

import io.github.luanelioliveira.booksearch.client.GoogleBookSearchClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoogleBookSearchService implements BookSearchService {

  private static final int MAX_RESULTS = 40;
  private static final String LANG_RESULTS = "en";
  private static final String TYPE_RESULTS = "books";

  private final GoogleBookSearchClient client;

  @Override
  public String searchForBooks(String text) {
    return client.searchFor(LANG_RESULTS, MAX_RESULTS, TYPE_RESULTS, text);
  }
}
