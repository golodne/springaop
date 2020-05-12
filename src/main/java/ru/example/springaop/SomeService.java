package ru.example.springaop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SomeService implements TransferService {
    public void invoke(String branchId) {
      log.info("invoke some service {}",branchId);
    }
}
