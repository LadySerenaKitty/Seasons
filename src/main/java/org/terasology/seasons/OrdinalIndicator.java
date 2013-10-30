/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.seasons;

/**
 * Created with IntelliJ IDEA.
 * User: Linus
 * Date: 10/29/13
 * Time: 5:28 PM
 * To change this template use File | Settings | File Templates.
 */
public final class OrdinalIndicator {
    static String of(int x) {
        x = Math.abs(x);
        x %= 100;

        switch (x)
        {
            case 11:
            case 12:
            case 13:
                return "th";
        }

        x %= 10;

        switch (x)
        {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }

    static String addTo(int x) {
        return String.format("%d%s", x, OrdinalIndicator.of(x));
    }
}
