package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1581v {
    f12075p("ADD"),
    f12077q("AND"),
    f12079r("APPLY"),
    f12081s("ASSIGN"),
    f12083t("BITWISE_AND"),
    f12085u("BITWISE_LEFT_SHIFT"),
    f12087v("BITWISE_NOT"),
    f12089w("BITWISE_OR"),
    f12091x("BITWISE_RIGHT_SHIFT"),
    y("BITWISE_UNSIGNED_RIGHT_SHIFT"),
    f12094z("BITWISE_XOR"),
    f12034A("BLOCK"),
    f12036B("BREAK"),
    f12037C("CASE"),
    f12038D("CONST"),
    f12039E("CONTINUE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("CONTROL"),
    f12040F("CREATE_ARRAY"),
    f12041G("CREATE_OBJECT"),
    f12042H("DEFAULT"),
    f12043I("DEFINE_FUNCTION"),
    f12044J("DIVIDE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("DO"),
    f12045K("EQUALS"),
    f12046L("EXPRESSION_LIST"),
    f12047M("FN"),
    N("FOR_IN"),
    f12048O("FOR_IN_CONST"),
    f12049P("FOR_IN_LET"),
    f12050Q("FOR_LET"),
    f12051R("FOR_OF"),
    f12052S("FOR_OF_CONST"),
    f12053T("FOR_OF_LET"),
    f12054U("GET"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("GET_CONTAINER_VARIABLE"),
    f12055V("GET_INDEX"),
    f12056W("GET_PROPERTY"),
    f12057X("GREATER_THAN"),
    f12058Y("GREATER_THAN_EQUALS"),
    f12059Z("IDENTITY_EQUALS"),
    f12060a0("IDENTITY_NOT_EQUALS"),
    f12061b0("IF"),
    f12062c0("LESS_THAN"),
    f12063d0("LESS_THAN_EQUALS"),
    f12064e0("MODULUS"),
    f12065f0("MULTIPLY"),
    f12066g0("NEGATE"),
    f12067h0("NOT"),
    f12068i0("NOT_EQUALS"),
    f12069j0("NULL"),
    f12070k0("OR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("PLUS_EQUALS"),
    f12071l0("POST_DECREMENT"),
    f12072m0("POST_INCREMENT"),
    f12073n0("QUOTE"),
    f12074o0("PRE_DECREMENT"),
    f12076p0("PRE_INCREMENT"),
    f12078q0("RETURN"),
    f12080r0("SET_PROPERTY"),
    f12082s0("SUBTRACT"),
    f12084t0("SWITCH"),
    f12086u0("TERNARY"),
    f12088v0("TYPEOF"),
    f12090w0("UNDEFINED"),
    f12092x0("VAR"),
    f12093y0("WHILE");


    /* renamed from: z0, reason: collision with root package name */
    public static final HashMap f12095z0 = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final int f12096o;

    static {
        for (EnumC1581v enumC1581v : values()) {
            f12095z0.put(Integer.valueOf(enumC1581v.f12096o), enumC1581v);
        }
    }

    EnumC1581v(String str) {
        this.f12096o = r2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.valueOf(this.f12096o).toString();
    }
}
