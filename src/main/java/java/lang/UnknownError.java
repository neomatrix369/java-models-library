/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.lang;

/**
 * Thrown when an unknown but serious exception has occurred in the
 * Java Virtual Machine.
 *
 * @author unascribed
 * @since   JDK1.0
 */
public
class UnknownError extends VirtualMachineError {
    private static final long serialVersionUID = 2524784860676771849L;

    /**
     * Constructs an <code>UnknownError</code> with no detail message.
     */
    public UnknownError() {
        super();
    }

    /**
     * Constructs an <code>UnknownError</code> with the specified detail
     * message.
     *
     * @param   s   the detail message.
     */
    public UnknownError(String s) {
        super(s);
    }

    // DIFFBLUE MODEL LIBRARY
    // While Object.getClass() is not modelled, we can get the same
    // functionality by adding one toString() method per subclass of
    // Throwable.
    @Override
    public String toString() {
        String message = getLocalizedMessage();
        return (message != null)
            ? ("java.lang.UnknownError: " + message)
            : "java.lang.UnknownError";
    }
}