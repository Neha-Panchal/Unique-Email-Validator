package com.neha.uniqueEmailAddresses.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.neha.uniqueEmailAddresses.model.EmailCountOutput;
/*This service interface  */
@Component
public interface UniqueEmailIdentifierService {


 EmailCountOutput validateUniqueEmails(List<String> userEmailInput);
}
