package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class XD implements Comparator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0475cE f7622o;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pattern pattern = AbstractC0518dE.f8479a;
        InterfaceC0475cE interfaceC0475cE = this.f7622o;
        return interfaceC0475cE.l(obj2) - interfaceC0475cE.l(obj);
    }
}
