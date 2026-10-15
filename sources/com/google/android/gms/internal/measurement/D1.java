package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class D1 {

    /* renamed from: p, reason: collision with root package name */
    public static final D1 f11717p;

    /* renamed from: q, reason: collision with root package name */
    public static final D1 f11718q;

    /* renamed from: r, reason: collision with root package name */
    public static final D1[] f11719r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ D1[] f11720s;

    /* renamed from: o, reason: collision with root package name */
    public final int f11721o;

    /* JADX INFO: Fake field, exist only in values array */
    D1 EF0;

    static {
        R1 r1 = R1.f11810s;
        D1 d12 = new D1("DOUBLE", 0, 0, 1, r1);
        R1 r12 = R1.f11809r;
        D1 d13 = new D1("FLOAT", 1, 1, 1, r12);
        R1 r13 = R1.f11808q;
        D1 d14 = new D1("INT64", 2, 2, 1, r13);
        D1 d15 = new D1("UINT64", 3, 3, 1, r13);
        R1 r14 = R1.f11807p;
        D1 d16 = new D1("INT32", 4, 4, 1, r14);
        D1 d17 = new D1("FIXED64", 5, 5, 1, r13);
        D1 d18 = new D1("FIXED32", 6, 6, 1, r14);
        R1 r15 = R1.f11811t;
        D1 d19 = new D1("BOOL", 7, 7, 1, r15);
        R1 r16 = R1.f11812u;
        D1 d110 = new D1("STRING", 8, 8, 1, r16);
        R1 r17 = R1.f11815x;
        D1 d111 = new D1("MESSAGE", 9, 9, 1, r17);
        R1 r18 = R1.f11813v;
        D1 d112 = new D1("BYTES", 10, 10, 1, r18);
        D1 d113 = new D1("UINT32", 11, 11, 1, r14);
        R1 r19 = R1.f11814w;
        D1 d114 = new D1("ENUM", 12, 12, 1, r19);
        D1 d115 = new D1("SFIXED32", 13, 13, 1, r14);
        D1 d116 = new D1("SFIXED64", 14, 14, 1, r13);
        D1 d117 = new D1("SINT32", 15, 15, 1, r14);
        D1 d118 = new D1("SINT64", 16, 16, 1, r13);
        D1 d119 = new D1("GROUP", 17, 17, 1, r17);
        D1 d120 = new D1("DOUBLE_LIST", 18, 18, 2, r1);
        D1 d121 = new D1("FLOAT_LIST", 19, 19, 2, r12);
        D1 d122 = new D1("INT64_LIST", 20, 20, 2, r13);
        D1 d123 = new D1("UINT64_LIST", 21, 21, 2, r13);
        D1 d124 = new D1("INT32_LIST", 22, 22, 2, r14);
        D1 d125 = new D1("FIXED64_LIST", 23, 23, 2, r13);
        D1 d126 = new D1("FIXED32_LIST", 24, 24, 2, r14);
        D1 d127 = new D1("BOOL_LIST", 25, 25, 2, r15);
        D1 d128 = new D1("STRING_LIST", 26, 26, 2, r16);
        D1 d129 = new D1("MESSAGE_LIST", 27, 27, 2, r17);
        D1 d130 = new D1("BYTES_LIST", 28, 28, 2, r18);
        D1 d131 = new D1("UINT32_LIST", 29, 29, 2, r14);
        D1 d132 = new D1("ENUM_LIST", 30, 30, 2, r19);
        D1 d133 = new D1("SFIXED32_LIST", 31, 31, 2, r14);
        D1 d134 = new D1("SFIXED64_LIST", 32, 32, 2, r13);
        D1 d135 = new D1("SINT32_LIST", 33, 33, 2, r14);
        D1 d136 = new D1("SINT64_LIST", 34, 34, 2, r13);
        D1 d137 = new D1("DOUBLE_LIST_PACKED", 35, 35, 3, r1);
        f11717p = d137;
        D1 d138 = new D1("FLOAT_LIST_PACKED", 36, 36, 3, r12);
        D1 d139 = new D1("INT64_LIST_PACKED", 37, 37, 3, r13);
        D1 d140 = new D1("UINT64_LIST_PACKED", 38, 38, 3, r13);
        D1 d141 = new D1("INT32_LIST_PACKED", 39, 39, 3, r14);
        D1 d142 = new D1("FIXED64_LIST_PACKED", 40, 40, 3, r13);
        D1 d143 = new D1("FIXED32_LIST_PACKED", 41, 41, 3, r14);
        D1 d144 = new D1("BOOL_LIST_PACKED", 42, 42, 3, r15);
        D1 d145 = new D1("UINT32_LIST_PACKED", 43, 43, 3, r14);
        D1 d146 = new D1("ENUM_LIST_PACKED", 44, 44, 3, r19);
        D1 d147 = new D1("SFIXED32_LIST_PACKED", 45, 45, 3, r14);
        D1 d148 = new D1("SFIXED64_LIST_PACKED", 46, 46, 3, r13);
        D1 d149 = new D1("SINT32_LIST_PACKED", 47, 47, 3, r14);
        D1 d150 = new D1("SINT64_LIST_PACKED", 48, 48, 3, r13);
        f11718q = d150;
        f11720s = new D1[]{d12, d13, d14, d15, d16, d17, d18, d19, d110, d111, d112, d113, d114, d115, d116, d117, d118, d119, d120, d121, d122, d123, d124, d125, d126, d127, d128, d129, d130, d131, d132, d133, d134, d135, d136, d137, d138, d139, d140, d141, d142, d143, d144, d145, d146, d147, d148, d149, d150, new D1("GROUP_LIST", 49, 49, 2, r17), new D1("MAP", 50, 50, 4, R1.f11806o)};
        D1[] values = values();
        f11719r = new D1[values.length];
        for (D1 d151 : values) {
            f11719r[d151.f11721o] = d151;
        }
    }

    public D1(String str, int i4, int i5, int i6, R1 r1) {
        this.f11721o = i5;
        R1 r12 = R1.f11806o;
        int i7 = i6 - 1;
        if (i7 == 1) {
            r1.getClass();
        } else if (i7 == 3) {
            r1.getClass();
        }
        if (i6 == 1) {
            r1.ordinal();
        }
    }

    public static D1[] values() {
        return (D1[]) f11720s.clone();
    }
}
