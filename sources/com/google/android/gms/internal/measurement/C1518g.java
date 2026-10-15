package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1518g implements InterfaceC1550n {

    /* renamed from: o, reason: collision with root package name */
    public final Double f11934o;

    public C1518g(Double d) {
        if (d == null) {
            this.f11934o = Double.valueOf(Double.NaN);
        } else {
            this.f11934o = d;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1518g) {
            return this.f11934o.equals(((C1518g) obj).f11934o);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Double f() {
        return this.f11934o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final String g() {
        Double d = this.f11934o;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Boolean h() {
        Double d = this.f11934o;
        boolean z4 = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }

    public final int hashCode() {
        return this.f11934o.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n i() {
        return new C1518g(this.f11934o);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Iterator l() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n n(String str, u0.g gVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C1562q(g());
        }
        throw new IllegalArgumentException(g() + "." + str + " is not a function.");
    }

    public final String toString() {
        return g();
    }
}
