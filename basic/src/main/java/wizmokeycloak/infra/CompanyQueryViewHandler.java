package wizmokeycloak.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import wizmokeycloak.config.kafka.KafkaProcessor;
import wizmokeycloak.domain.*;

@Service
public class CompanyQueryViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private CompanyQueryRepository companyQueryRepository;
    //>>> DDD / CQRS
}
