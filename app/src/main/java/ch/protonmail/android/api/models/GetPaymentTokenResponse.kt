/*
 * Copyright (c) 2020 Proton Technologies AG
 * 
 * This file is part of ProtonMail.
 * 
 * ProtonMail is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ProtonMail is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with ProtonMail. If not, see https://www.gnu.org/licenses/.
 */
package ch.protonmail.android.api.models

import com.google.gson.annotations.SerializedName

// region constants
private const val FIELD_APPROVAL_URL = "ApprovalURL"
private const val FIELD_TOKEN_STATUS = "Status"
// endregion

data class GetPaymentTokenResponse(
        @SerializedName(FIELD_APPROVAL_URL)
        var approvalUrl: String,
        @SerializedName(FIELD_TOKEN_STATUS)
        var status: PaymentToken.Status
) : ResponseBody()
