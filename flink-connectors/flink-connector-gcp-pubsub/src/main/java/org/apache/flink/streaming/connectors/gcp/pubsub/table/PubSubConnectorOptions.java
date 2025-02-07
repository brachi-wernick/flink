/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.flink.streaming.connectors.gcp.pubsub.table;

import org.apache.flink.annotation.PublicEvolving;
import org.apache.flink.configuration.ConfigOption;
import org.apache.flink.configuration.ConfigOptions;

/** Options for the PubSub connector. */
@PublicEvolving
public class PubSubConnectorOptions {

    public static final ConfigOption<String> PROJECT_NAME =
            ConfigOptions.key("projectName")
                    .stringType()
                    .noDefaultValue()
                    .withDescription("Name of the PubSub project backing this table.");

    public static final ConfigOption<String> SUBSCRIPTION =
            ConfigOptions.key("subscription")
                    .stringType()
                    .noDefaultValue()
                    .withDescription("Name of the PubSub subscription backing this table.");

    public static final ConfigOption<Boolean> CHECKPOINT_DISABLED =
            ConfigOptions.key("checkpointDisabled")
                    .booleanType()
                    .defaultValue(false)
                    .withDescription("Disable checkpoints, relevant only for testing and preview.");

    private PubSubConnectorOptions() {}
}
