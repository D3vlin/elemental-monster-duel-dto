package co.d3vlin.elementalmonsterduel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WhatsNewEntryDTO {
    @Schema(description = "What's New entry identifier")
    private Long id;

    @Schema(description = "When this entry was published")
    private Instant publishedAt;

    @Schema(description = "Entry title")
    private String title;

    @Schema(description = "Entry body")
    private String body;
}
