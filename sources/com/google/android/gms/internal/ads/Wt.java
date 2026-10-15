package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Wt implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f7577a;

    public Wt(Pattern pattern) {
        pattern.getClass();
        this.f7577a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f7577a.matcher(str).matches();
    }
}
