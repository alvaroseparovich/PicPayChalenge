package org.separovich.domain.domain.users.exceptions

class UserMustHaveEmailAndDocumentException(
    message: String = "User must have email or document.",
    cause: Throwable? = null,
) : Exception(message, cause)
