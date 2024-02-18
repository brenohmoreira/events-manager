package com.brenohmoreira.eventservice.repositories;

import com.brenohmoreira.eventservice.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
