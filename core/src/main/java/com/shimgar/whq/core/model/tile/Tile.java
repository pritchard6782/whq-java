package com.shimgar.whq.core.model.tile;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Tile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String imageUrl;
	private int numberOfExits;
	@OneToMany
	private Set<RotatedTile> rotatedTiles;
}
