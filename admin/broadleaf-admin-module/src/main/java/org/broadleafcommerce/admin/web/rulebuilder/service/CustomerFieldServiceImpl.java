/*
 * Copyright 2008-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.admin.web.rulebuilder.service;

import org.broadleafcommerce.common.presentation.client.SupportedFieldType;
import org.broadleafcommerce.openadmin.server.service.type.RuleIdentifier;
import org.broadleafcommerce.openadmin.web.rulebuilder.dto.FieldData;
import org.broadleafcommerce.openadmin.web.rulebuilder.service.AbstractRuleBuilderFieldService;
import org.springframework.stereotype.Service;

/**
 * An implementation of a RuleBuilderFieldService
 * that constructs metadata necessary
 * to build the supported fields for a Customer entity
 *
 * @author Elbert Bautista (elbertbautista)
 */
@Service("blCustomerFieldService")
public class CustomerFieldServiceImpl extends AbstractRuleBuilderFieldService {

    @Override
    public void init() {
        fields.add(new FieldData.Builder()
                .label("rule_customerDeactivated")
                .name("deactivated")
                .operators("blcOperators_Boolean")
                .options("[]")
                .type(SupportedFieldType.BOOLEAN)
                .build());
        fields.add(new FieldData.Builder()
                .label("rule_customerId")
                .name("id")
                .operators("blcOperators_Numeric")
                .options("[]")
                .type(SupportedFieldType.ID)
                .build());
        fields.add(new FieldData.Builder()
                .label("rule_customerReceiveEmail")
                .name("receiveEmail")
                .operators("blcOperators_Boolean")
                .options("[]")
                .type(SupportedFieldType.BOOLEAN)
                .build());
        fields.add(new FieldData.Builder()
                .label("rule_customerRegistered")
                .name("registered")
                .operators("blcOperators_Boolean")
                .options("[]")
                .type(SupportedFieldType.BOOLEAN)
                .build());
        fields.add(new FieldData.Builder()
                .label("rule_customerUserName")
                .name("username")
                .operators("blcOperators_Text")
                .options("[]")
                .type(SupportedFieldType.STRING)
                .build());
        fields.add(new FieldData.Builder()
                .label("rule_customerEmailAddress")
                .name("emailAddress")
                .operators("blcOperators_Text")
                .options("[]")
                .type(SupportedFieldType.STRING)
                .build());
        fields.add(new FieldData.Builder()
                .label("rule_customerFirstName")
                .name("firstName")
                .operators("blcOperators_Text")
                .options("[]")
                .type(SupportedFieldType.STRING)
                .build());
        fields.add(new FieldData.Builder()
                .label("rule_customerLastName")
                .name("lastName")
                .operators("blcOperators_Text")
                .options("[]")
                .type(SupportedFieldType.STRING)
                .build());
    }

    @Override
    public String getName() {
        return RuleIdentifier.CUSTOMER;
    }

    @Override
    public String getDtoClassName() {
        return "org.broadleafcommerce.profile.core.domain.CustomerImpl";
    }

}
