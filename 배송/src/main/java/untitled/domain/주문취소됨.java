package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class 주문취소됨 extends AbstractEvent {

    private Long id;
}
