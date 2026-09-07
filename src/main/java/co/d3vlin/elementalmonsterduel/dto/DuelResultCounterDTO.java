package co.d3vlin.elementalmonsterduel.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class DuelResultCounterDTO {
    @Schema(description = "Total duels recorded")
    private Integer total;

    @Schema(description = "Duels won")
    private Integer wins;

    @Schema(description = "Duels lost")
    private Integer losses;

    @Schema(description = "Duels drawn")
    private Integer draws;

    @Schema(description = "Duels abandoned")
    private Integer abandons;
}
