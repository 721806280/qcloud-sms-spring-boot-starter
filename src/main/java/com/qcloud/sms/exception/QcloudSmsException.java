package com.qcloud.sms.exception;

/**
 * QcloudSmsException
 *
 * @author xm.z
 */
public class QcloudSmsException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new runtime exception with {@code null} as its detail message. The
     * cause is not initialized, and may subsequently be initialized by a call to
     * {@link #initCause}.
     */
    public QcloudSmsException() {
        super();
    }

    /**
     * Constructs a new runtime exception with the specified detail message. The cause is
     * not initialized, and may subsequently be initialized by a call to
     * {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for later retrieval
     *                by the {@link #getMessage()} method.
     */
    public QcloudSmsException(String message) {
        super(message);
    }

}