package org.example;

import org.jspecify.annotations.Nullable;

class A {
	final @Nullable Long longValue;

	A() {
		this(null);
	}

	A(@Nullable Long longValue) {
		this.longValue = longValue;
	}
}
