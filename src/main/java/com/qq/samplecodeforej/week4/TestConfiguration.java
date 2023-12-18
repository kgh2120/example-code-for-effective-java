package com.qq.samplecodeforej.week4;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TestConfiguration implements InitializingBean {

    private final ItemRepository itemRepository;

    public TestConfiguration(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        itemRepository.save(new Item(34, MemberV2.HYG, Topic.ENUM_AND_ANNOTATION));
        itemRepository.save(new Item(35, MemberV2.KKH, Topic.ENUM_AND_ANNOTATION));
        itemRepository.save(new Item(36, MemberV2.KKH, Topic.ENUM_AND_ANNOTATION));
        itemRepository.save(new Item(37, MemberV2.KKH, Topic.ENUM_AND_ANNOTATION));
    }
}
