package co.d3vlin.elementalmonsterduel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDTO {
    @Schema(description = "Card identifier")
    private Long id;

    @Schema(description = "Card name")
    private String name;

    @Schema(description = "Element of the card")
    private Element element;

    @Schema(description = "Elemental group")
    private String elementGroup;

    @Schema(description = "Card power range")
    private PowerRank powerRank;

    @Schema(description = "Base attack")
    private Integer atk;

    @Schema(description = "Base armor")
    private Integer armor;

    @Schema(description = "Base life")
    private Integer life;

    @Schema(description = "Seal turns before you can use the special ability")
    private Integer seal;

    @Schema(description = "Short lore")
    private String lore;
}
