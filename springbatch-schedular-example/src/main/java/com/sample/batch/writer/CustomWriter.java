package com.sample.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.sample.batch.models.Domain;

public class CustomWriter implements ItemWriter<Domain> {

  @Override
  public void write(List<? extends Domain> items) throws Exception {
    System.out.println("writer ....... " + items.size());
    for (Domain domain : items) {
    	System.out.println(domain + "\n");
    }
  }
}
