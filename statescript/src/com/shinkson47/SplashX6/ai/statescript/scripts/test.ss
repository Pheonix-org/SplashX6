name = TestStateMachine;
description = "This is a test Statemachine Script.";

// Start by selecting a new destination.
default = MoveOrTravel;

import {
	import com.shinkson47.SplashX6.game.GameHypervisor;
}

// While we have a pathfinding nodes to follow, travels along path.
state Travel {
	behaviour {
		// Any valid java code.
		int exampleCode = 0;
		exampleCode++;
		return;
	}
}

// State which will either choose a new location to travel to, or will settle.
state MoveOrSettle {
	behaviour {
		return;
	}

	// Keep track of how many time's we've reached a new destination.
	enter {
		return;
	}
}

// If we've reached our destination (No pathfinding nodes left), choose new destination.
switch Travel > MoveOrSettle if ( GameHypervisor.unit_selected() == null )

// Always go back to traveling after choosing a new location.
switch MoveOrSettle > Travel