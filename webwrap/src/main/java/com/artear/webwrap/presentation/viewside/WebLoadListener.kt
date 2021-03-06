package com.artear.webwrap.presentation.viewside

import com.artear.tools.error.NestError

/**
 * Simple interface to listen the url loading execution
 */
interface WebLoadListener {


    /**
     * Execute when start to loading content
     */
    fun onLoading()

    /**
     * Execute on 100% of progress is loaded.
     *
     * Warning: also this method can be invoke after an error. Be careful and dismiss
     * the placeholder and show your web view only when the placeholder is visible.
     * If your place holder is visible yet, probably there was no error.
     */
    fun onLoaded()

    /**
     * Notify when an error occurs on loading the main url. Can be from receive error or http error.
     * Note: you should do something when the error is notified.
     *
     * @param error The NestError. You can use them to select the kind of error.
     */
    fun onError(error: NestError)
}
