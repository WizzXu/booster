package com.didiglobal.booster.android.gradle.v7_3

import com.android.repository.Revision
import com.didiglobal.booster.gradle.AGPInterface
import com.didiglobal.booster.gradle.AGPInterfaceFactory
import com.google.auto.service.AutoService

@AutoService(AGPInterfaceFactory::class)
class V73Factory : AGPInterfaceFactory {

    override val revision: Revision = Revision(7, 3, 0)

    override fun newAGPInterface(): AGPInterface = V73

}
