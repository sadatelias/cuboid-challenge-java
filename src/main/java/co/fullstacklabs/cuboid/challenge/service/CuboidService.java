package co.fullstacklabs.cuboid.challenge.service;

import java.util.List;

import co.fullstacklabs.cuboid.challenge.dto.CuboidDTO;

/**
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
public interface CuboidService {
    CuboidDTO create(CuboidDTO cuboid);

    List<CuboidDTO> getAll();

    CuboidDTO update(CuboidDTO cuboid);
    
    CuboidDTO delete(CuboidDTO cuboid);
}
