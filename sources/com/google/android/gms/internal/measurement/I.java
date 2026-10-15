package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I extends AbstractC1106r4 implements J {
    public I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 1);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void d3(Bundle bundle) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, bundle);
        L2(Q3, 1);
    }
}
