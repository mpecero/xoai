/**
 * Copyright 2012 Lyncode
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lyncode.xoai.common.dataprovider.core;

import java.util.List;

/**
 * @author DSpace @ Lyncode
 * @version 2.0.0
 */
public class ListSetsResult {
	private boolean hasMore;
	private List<Set> results;

	public ListSetsResult(boolean hasMoreResults, List<Set> results) {
		this.hasMore = hasMoreResults;
		this.results = results;
	}

	public boolean hasMore() {
		return hasMore;
	}

	public List<Set> getResults() {
		return results;
	}

}
