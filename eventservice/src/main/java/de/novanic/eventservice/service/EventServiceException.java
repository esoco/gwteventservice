/*
 * GWTEventService
 * Copyright (c) 2014 and beyond, GWTEventService Committers
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 * Other licensing for GWTEventService may also be possible on request.
 * Please view the license.txt of the project for more information.
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
package de.novanic.eventservice.service;

/**
 * {@link de.novanic.eventservice.service.EventServiceException} is an general exception for GWTEventService
 * that should primarily be used for public interfaces which are used to exchange implementations.
 *
 * @author sstrohschein
 *         <br>Date: 15.03.2010
 *         <br>Time: 23:08:57
 */
public class EventServiceException extends Exception
{
    /**
     * Creates a new {@link de.novanic.eventservice.service.EventServiceException} with a message.
     * @param aMessage message
     */
    public EventServiceException(String aMessage) {
        super(aMessage);
    }

    /**
     * Creates a new {@link de.novanic.eventservice.service.EventServiceException} with a message and a cause throwable.
     * @param aMessage message
     * @param aThrowable throwable
     */
    public EventServiceException(String aMessage, Throwable aThrowable) {
        super(aMessage, aThrowable);
    }
}
