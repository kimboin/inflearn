package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPollicy {

    int discount(Member member, int price);
}
