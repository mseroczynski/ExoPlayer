package com.google.android.exoplayer2.audioteka;

/**
 * Pozwala sprawdzić w alternatywny sposób czy licencja jest wygaśnięta
 */
public interface LicenseExpirationRevalidator {
    boolean isLicenseValid();
}