/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.confluence.filter.event;

import org.xwiki.observation.event.AbstractFilterableEvent;


/**
 * Event emitted after the filtering process is done, but before closing the confluence package.
 *
 * <ul>
 * <li>source: the input filter stream that triggers the event.</li>
 * <li>data: the confluence package that has been read.</li>
 * </ul>
 *
 * @version $Id$
 * @since 9.21.0
 */
public class ConfluenceFilteredEvent extends AbstractFilterableEvent
{
}