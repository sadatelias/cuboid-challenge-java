package co.fullstacklabs.cuboid.challenge.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CuboidDTO {
	private Long id;

	@NotNull(message = "Cuboid width can't be null.")
	private Float width;

	@NotNull(message = "Cuboid height can't be null.")
	private Float height;

	@NotNull(message = "Cuboid depth can't be null.")
	private Float depth;

	private Double volume;

	@NotNull(message = "Cuboid related bag can't be null.")
	private Long bagId;

	public Double getVolume() {
		volume = 0d;
		volume = (double) (width * height * depth);
		return volume;
	}
}
