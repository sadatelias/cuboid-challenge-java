package co.fullstacklabs.cuboid.challenge.dto;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import co.fullstacklabs.cuboid.challenge.model.Bag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BagDTO {
    private Long id;

    @NotNull(message = "Bag volume can't be null.")
    private Double volume;

    @NotNull(message = "Bag title can't be null.")
    @Size(min = 1, max = Bag.TITLE_MAX_SIZE, message = "Bag title maximum size is " + Bag.TITLE_MAX_SIZE + " characters.")
    private String title;
    private Double payloadVolume;
    private Double availableVolume;
    private List<CuboidDTO> cuboids;
    
    public Double getPayloadVolume() {
    	payloadVolume = 0d;
    	for (CuboidDTO cuboidDTO : cuboids) {
    		payloadVolume += cuboidDTO.getVolume();
    	}
    	return payloadVolume;
    }
    
    public Double getAvailableVolume() {
    	availableVolume = 0d;
    	availableVolume = volume - getPayloadVolume();
    	return availableVolume;
    }
}
