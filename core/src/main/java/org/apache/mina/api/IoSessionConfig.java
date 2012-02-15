/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.apache.mina.api;

/**
 * The configuration of {@link IoSession}.
 *
 * @author <a href="http://mina.apache.org">Apache MINA Project</a>
 */
public interface IoSessionConfig {

    /**
     * Returns idle time for the specified type of idleness in milli-seconds.
     * @see IdleStatus
     * @return the idle time in ms or <code>-1</code> if no idle time configured for this status
     */
    long getIdleTimeInMillis(IdleStatus status);

    /**
     * Set the delay before an {@link IoSession} is considered idle for a given
     * operation type (read/write/both) @see IdleStatus
     *
     * @param status          the type of idle (read/write/both) timeout to set
     * @param ildeTimeInMilli the timeout in milliseconds (<code>-1</code> for no idle detection on this status)
     */
    void setIdleTimeInMillis(IdleStatus status, long ildeTimeInMilli);

}
