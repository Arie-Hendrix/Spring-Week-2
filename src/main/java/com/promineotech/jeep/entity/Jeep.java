package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jeep {
  
   private long modelPK;
   private JeepModel modelID;
   private String trimLevel;
   private int numDoors;
   private int wheelSize;
   private BigDecimal basePrice;
  
}
