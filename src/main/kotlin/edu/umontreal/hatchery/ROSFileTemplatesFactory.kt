package edu.umontreal.hatchery

import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptor
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptorFactory
import com.intellij.ide.fileTemplates.FileTemplateDescriptor


class ROSFileTemplatesFactory : FileTemplateGroupDescriptorFactory {
    override fun getFileTemplatesDescriptor() =
            FileTemplateGroupDescriptor(HatcheryBundle.message("plugin.description"), Icons.file).apply {
                addTemplate(FileTemplateDescriptor("package.xml", Icons.package_file))
            }
}