package com.alibou.ecommerce.orderline;

import lombok.Builder;

@Builder
public record OrderLineResponse(
        Integer id,
        double quantity
) {
}
