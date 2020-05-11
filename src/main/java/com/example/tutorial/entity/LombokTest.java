// 참고 블로그 : https://ijbgo.tistory.com/6

package com.example.tutorial.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Singular;
import lombok.ToString;

@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@ToString(exclude="password")
@EqualsAndHashCode(of={"id", "name"})
@Builder
public class LombokTest {
	private int id;
	@NonNull private String name;
	private String password;
	@Singular private List<String> familys;
}
