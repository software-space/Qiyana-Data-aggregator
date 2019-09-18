package ca.softwarespace.qiyanna.dataaggregator.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ChampionDto {

  private String name;
  private String accountId;
  private int cs;
  private int kills;
  private int deaths;
  private int assists;
  private boolean isWinner;
  private int gold;
  private double csPerMin;

}